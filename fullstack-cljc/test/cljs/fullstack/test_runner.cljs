;; This test runner is intended to be run from the command line
(ns fullstack.test-runner
  (:require
    ;; require all the namespaces that you want to test
    [fullstack.core-test]
    [figwheel.main.testing :refer [run-tests-async]]))

(defn -main []
  (run-tests-async 5000))
