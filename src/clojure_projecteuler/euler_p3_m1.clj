(ns clojure-projecteuler.euler_p3_m1)

(defn square?
  [n]
  "Checks if square root of number is integer"
  (let [normalized-n (max n (- n))
        sqrt (Math/sqrt normalized-n)
        int-sqrt (int sqrt)]
    (== sqrt int-sqrt)))
