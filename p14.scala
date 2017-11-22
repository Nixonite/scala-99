object P14{
    def duplicate[A](ls: List[A]): List[A] = {
        ls flatMap { e => List.fill(2) (e)}
    }
}
