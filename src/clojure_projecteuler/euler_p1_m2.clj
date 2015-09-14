(ns clojure-projecteuler.euler_p1_m2)

(defn sum-of-sequence
  [n x]
  (if (= 0 (mod n x))
    (def n1 (- n x))
    (def n1 n))
  (let [occ-num (int (Math/floor (/ n1 x)))
        last-x (* occ-num x)
        sum-of-first-and-last (+ x last-x)
        average (/ sum-of-first-and-last 2)]
    (int (* occ-num average))))

(defn sum-of-deviders
  [range x y]
  (let [sum-of-x (sum-of-sequence range x)
        sum-of-y (sum-of-sequence range y)
        sum-of-xy (sum-of-sequence range (* x y))]
    (- (+ sum-of-x sum-of-y) sum-of-xy)))
