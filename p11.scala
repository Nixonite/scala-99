object P11{

    def encodeModified[A](ls: List[A]): List[Any] = {
        P09.packConsecutives(ls) map {e => if (e.length > 1) (e.length, e.head) else e.head}
    }
}
