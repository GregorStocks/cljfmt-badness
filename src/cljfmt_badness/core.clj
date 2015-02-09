(ns cljfmt-badness.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (let [x [1 2 ;; test1
           2 3 ;; test2
           ]])
  (println x "Hello, World!"))
