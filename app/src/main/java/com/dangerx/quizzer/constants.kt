package com.dangerx.quizzer

object constants {

    const val  USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val que1 = Questions(
            1, "What country these flag belong too",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Finland", "Austria",
            1

        )
        questionsList.add(que1)

        val que2 = Questions(
            2, "What country these flag belong too",
            R.drawable.ic_flag_of_australia,
            "India", "Australia",
            "Pakistan","Thailand",
            2
        )
        questionsList.add(que2)

        val que3 = Questions(
            3, "Name This Bodybuilder",
            R.drawable.kevin,
            "Ramon dino", "Ronnie Colemon",
            "Kevin levrone", "Cbum",
            3



        )
        questionsList.add(que3)

        val que4 = Questions(
            4,"How Many Olympia Does Arnold Have won",
            R.drawable.arnold,
            "1","7",
            "8","6",
            2

        )
        questionsList.add(que4)

        val que5 = Questions(
            5,"John cena total championship in wwe ",
            R.drawable.johncena,
            "16","15",
            "13","9",
            1,
        )
        questionsList.add(que5)

        val que6 = Questions(
            6,"messi total ballon d`or",
            R.drawable.messi,
            "8", "7",
            "2", "5",
            8,
        )
        questionsList.add(que6)

        val que7 = Questions(
            7,"how many fights does khabib  has lost",
            R.drawable.khabib,
            "3", "0",
            "4","5",
            2,
        )
        questionsList.add(que7)

        val que8 = Questions(
            8,"Name this chinese dog Imported in india",
            R.drawable.chinhua,
            "Daike","chinhua",
            "bulldog", "Pug",
            1
        )
        questionsList.add(que8)

        val que9 = Questions(
            9,"Which country Flag is this",
            R.drawable.ic_flag_of_fiji,
            "India","south Africa",
            "China","Fiji",
            4
        )
        questionsList.add(que9)

        return questionsList






    }
}