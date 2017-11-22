object P08{

    def dedupeConsecutive[A](ls: List[A]): List[A] = {
        ls.foldRight(List[A]()) {
            case (x, xs) => {
                if (xs.isEmpty || xs.head != x)
                    x::xs
                else xs
            }
        }
    }

}
