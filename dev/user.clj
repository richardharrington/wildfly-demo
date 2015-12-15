(ns user
  (:require [immutant.web :as web]
            [immutant.caching :as caching]
            [immutant.messaging :refer :all]
            [immutant.scheduling :as scheduling]
            [immutant.transactions :as transactions]
            [immutant.wildfly :as wildfly]
            [clojure.pprint :refer (pprint)]
            [clojure.tools.namespace.repl :refer (refresh refresh-all)]



            ))

(def port (wildfly/messaging-remoting-port))

(def ctx-map {:host "localhost", :port port, :username "tim", :password "marmite", :remote-type :hornetq-wildfly})

(defn get-q
  ([name]
   (get-q name ctx-map))
  ([name c-map]
   (with-open [c (context c-map)]
     (queue name))))

(defn pub-q
  ([name msg]
   (pub-q name ctx-map msg))
  ([name c-map msg]
   (with-open [c (context c-map)]
     (publish (get-q name c-map) msg))))
