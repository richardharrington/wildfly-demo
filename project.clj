(defproject demo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.immutant/immutant "2.1.1"]
                 [cheshire "5.3.1"]
                 ]
  :plugins [[lein-immutant   "2.1.0"]]
  :source-paths ["dev", "src"]
  :main ^:skip-aot demo.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}

  :immutant {:war {:destination "/Users/richardharrington/Workspace/immutant-demo/wildfly-9.0.2.Final"
                   :dev? true}

             }
  )
