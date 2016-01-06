(ns demo.core
  (:require [immutant.messaging :as msg]
            [immutant.util :as util])
  (:gen-class))

(defn get-context []
  (when-not (util/in-container?)
    (msg/context :host "localhost")))

(defn request [qname request-data callback]
  (with-open [ctx (get-context)]
    (callback @(msg/request (msg/queue qname :context ctx) request-data))))

(defn -main
  [& args]
  nil)
