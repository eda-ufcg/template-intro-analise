for i in `seq 100`; do
    random_number=$((1 + RANDOM % 1000000))
    for i in `seq $random_number`; do
        echo "a \c"
    done
    echo
done
