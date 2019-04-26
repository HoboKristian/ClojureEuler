(defn divides[n d]
  (= (mod n d) 0))
(defn divisors[n]
  (filter #(divides n %) (range 1 (Math/ceil (Math/sqrt (inc n))))))

(defn triangle-number [n]
  (* n (/ (+ n 1) 2)))

(def triangles (map triangle-number (iterate inc 1)))

(println (first (filter #(> (count (divisors %)) 250) triangles)))

;(map #(count (divisors (first %)))
