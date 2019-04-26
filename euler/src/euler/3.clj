(defn is-prime
  ([n] (is-prime n (Math/ceil (Math/sqrt n))))
  ([n d]
   (if (== d 1)
     true
     (if (== (mod n d) 0)
       false
       (recur n (dec d))))))

(defn largest-prime-factor [n]
  (filter #(== (mod n %) 0) (range 2 (Math/sqrt n))))

(println (apply max (filter is-prime (largest-prime-factor 600851475143))))
