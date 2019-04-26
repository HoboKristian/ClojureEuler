(defn sum-of-all[n]
  (apply + (range 1 n)))

(defn squared-all[n]
  (map #(* % %) (range 1 n)))

(println (- (* (sum-of-all 101) (sum-of-all 101)) (apply + (squared-all 101))))
