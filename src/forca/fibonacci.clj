(defn fib[x]
    (if (= x 0) 0 
    (if (= x 1) 1 
    (+ (fib (- x 1)) (fib (- x 2))))))

(defn fib-recursao-cauda[x]
    (loop [a 1 b 1 numero 2]
        (if 
            (= numero x) b
            (recur b (+ a b) (inc numero)))))