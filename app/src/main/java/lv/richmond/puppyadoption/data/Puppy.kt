package lv.richmond.puppyadoption.data

enum class Gender {
    MALE,
    FEMALE
}
data class Puppy(val name: String, val gender: Gender, val bio: String, val profilePicId: Int) {
}