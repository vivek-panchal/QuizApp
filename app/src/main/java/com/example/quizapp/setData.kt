package com.example.quizapp

object setData {

    const val name:String="name"
    const val score:String="score"

    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()

        var question1 = QuestionData(
            1,
            "Which one of the following is an application of Stack Data Structure?",
            "Managing function calls",
            "The stock span problem",
            "Arithmetic expression evaluation",
            "All of the above",
            4
        )

        var question2 = QuestionData(
            2,
            "Which of the following sorting algorithms can be used to sort a random linked list with minimum time complexity?",
            "Insertion Sort",
            "Quick Sort",
            "Merge Sort",
            "Heap Sort",
            3
        )
        var question3 = QuestionData(
            3,
            "Which one of the following is an application of queue Data Structure?",
            "When a resource is shared among multiple consumers.",
            "When data is transferred asynchronously (data not necessarily received at same rate as sent) between two processes",
            "Load Balancing",
            "All of the above",
            4
        )
        var question4 = QuestionData(
            4,
            "A program P reads in 500 integers in the range [0..100] representing the scores of 500 students. It then prints the frequency of each score above 50. What would be the best way for P to store the frequencies? (GATE CS 2005)",

            "An array of 150 numbers",
            "An array of 50 numbers",
            "An array of 250 numbers",
            "An array of 500 numbers",
            2
        )
        var question5 = QuestionData(
            5,
            "Given a hash table T with 25 slots that stores 2000 elements, the load factor α for T is",
            "80",
            "0.0125",
            "8000",
            "1.25",
            1
        )
        var question6 = QuestionData(
            6,
            "An advantage of chained hash table (external hashing) over the open addressing scheme is",
            "Worst case complexity of search operations is less",
            "Space used is less",
            "Deletion is easier",
            "None of the above",
            3
        )
        var question7 = QuestionData(
            7,

            "Which of the following is the full form of DDL?",
            "Data definition language",
            "Data derivation language",
            "Data dynamic language",
            "Data detailed language",
            1
        )
        var question8 = QuestionData(
            8,
            "Which of the following is preserved in execution of transaction in isolation?",
            "Atomicity",
            "Isolation",
            "Durability",
            "Consistency",
            4
        )
        var question9 = QuestionData(
            9,
            "Which normalization form is based on the transitive dependency?",
            "1NF",
            "2NF",
            "3NF",
            "BCNF",
            3
        )
        var question10 = QuestionData(
            10,
            "What is rows of a relation known as?",
            "Degree",
            "Entity",
            "Tuple",
            "None",
            3
        )
        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)
        que.add(question6)
        que.add(question7)
        que.add(question8)
        que.add(question9)
        que.add(question10)
        return que

    }
}