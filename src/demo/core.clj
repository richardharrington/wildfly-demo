(ns demo.core
  (:require [immutant.web :as web]
            [immutant.caching :as caching]
            [immutant.messaging :refer :all]
            [immutant.scheduling :as scheduling]
            [immutant.transactions :as transactions]
            [immutant.wildfly :as wildfly]
            [clojure.pprint :refer (pprint)]
            [clojure.tools.namespace.repl :refer (refresh refresh-all)]

            )
  (:gen-class))

(defn app [request]
  {:status 200
   :body "Hello World!"})

(defn -main
  [& args]
  (web/run app))
