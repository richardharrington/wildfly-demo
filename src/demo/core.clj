(ns demo.core
  (:require [immutant.messaging :as msg]
            [immutant.util :as util])
  (:gen-class))

(defn request [qname request-data callback]
  (if (util/in-container?)
    (callback @(msg/request (msg/queue qname) request-data))
    (with-open [ctx (msg/context :host "localhost" :port 5445)]
      (callback @(msg/request (msg/queue qname :context ctx) request-data)))))

(defn -main
  [& args]
  nil)
