(defn soma[n] 

    (loop [contador 1 soma 0]
        (if (> contador n) soma
        (recur (inc contador) (+ soma contador)))))