(defproject oddjob "0.0.3-SNAPSHOT"
            :description "Hadoop utilities for MrJob that must run in the JVM"
            :dependencies [[org.clojure/clojure "1.2.1"]
                           [org.clojure/clojure-contrib "1.2.0"]
                           [org.apache.hadoop/hadoop-streaming "0.20.203.0"]]
            :dev-dependencies [[org.apache.hadoop/hadoop-core "0.20.203.0"]
                               [swank-clojure "1.2.1"]]
            :main oddjob.core
            :aot :all)
