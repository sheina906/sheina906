Hi

This is my first contribution on github and I'm not sure if I did it right.
This is a project in java to find all the primes up to a limit you input, it works like this:
It starts with an arraylist that has 2 and 3.
Then it goes over all the numbers smaller than the limit you gave wuth jumps of 2,4,2,4.... as to jump over any even numbers and numbers that are divisible by 3.
It checks each number it goes over by seeing if it's divisible by the primes it's gathered so far.
According to the fundemental theorem of arithmetics, every number is either a prime or a multiple of primes, so the algorithms checks if the number is a multiple of primes, if it's not then it has to be a prime and it adds the number to the list.
At the end after it has all the primes up to the limit in an arraylist it prints them.

I've attached it in a java file and a jar file (I will probably do it in more languages and add them too).

This is the most efficient algorithm I know of, if you know of more efficient ones please let me know.
