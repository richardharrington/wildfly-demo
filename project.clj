(defproject demo "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.immutant/messaging "2.1.1"]]
  :plugins [[lein-immutant "2.1.0"]]
  :source-paths ["src"]
  :main ^:skip-aot demo.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}

  :immutant {:war {:destination "/Users/richardharrington/Workspace/immutant-demo/wildfly-9.0.1.Final"
                   :nrepl {:start? true}}})
