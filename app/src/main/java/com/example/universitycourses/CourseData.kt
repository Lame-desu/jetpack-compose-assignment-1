package com.example.universitycourses

val courseList = listOf(
    // Year I Semester I
    Course(
        title = "Communicative English Language",
        code = "FLEn-1011",
        creditHours = 5,
        description = "Develops English language proficiency for academic and professional contexts, focusing on reading, writing, listening, and speaking skills.",
        prerequisites = "None",
        year = 1,
        semester = 1
    ),
    Course(
        title = "Mathematics For Natural Sciences",
        code = "Math-1011",
        creditHours = 5,
        description = "Covers fundamental mathematical concepts essential for natural sciences including algebra, functions, and basic calculus.",
        prerequisites = "High school mathematics",
        year = 1,
        semester = 1
    ),
    Course(
        title = "Critical Thinking",
        code = "LoCT 1011",
        creditHours = 5,
        description = "Develops analytical and logical reasoning skills to evaluate arguments and solve problems systematically.",
        prerequisites = "None",
        year = 1,
        semester = 1
    ),
    Course(
        title = "General Psychology",
        code = "Psch 1011",
        creditHours = 5,
        description = "Introduction to the scientific study of behavior and mental processes, covering major theories and research findings.",
        prerequisites = "None",
        year = 1,
        semester = 1
    ),
    Course(
        title = "General Physics",
        code = "Phys 1011",
        creditHours = 5,
        description = "Fundamental principles of mechanics, thermodynamics, and electromagnetism with laboratory experiments.",
        prerequisites = "High school physics",
        year = 1,
        semester = 1
    ),
    Course(
        title = "Physical Fitness",
        code = "SpSc 1011",
        creditHours = 5,
        description = "Practical course focusing on physical health, exercise techniques, and wellness principles.",
        prerequisites = "None",
        year = 1,
        semester = 1
    ),
    Course(
        title = "Geography of Ethiopia and the Horn",
        code = "GeES 1011",
        creditHours = 5,
        description = "Comprehensive study of the physical and human geography of Ethiopia and the Horn of Africa region.",
        prerequisites = "None",
        year = 1,
        semester = 1
    ),

    // Year I Semester II
    Course(
        title = "Communicative English Language II",
        code = "FLEn-1012",
        creditHours = 5,
        description = "Advanced English language skills with focus on academic writing, presentation skills, and critical analysis.",
        prerequisites = "Communicative English Language I",
        year = 1,
        semester = 2
    ),
    Course(
        title = "Social Anthropology",
        code = "Anth 1012",
        creditHours = 4,
        description = "Study of human societies and cultures, with emphasis on social structures, kinship, and cultural practices.",
        prerequisites = "None",
        year = 1,
        semester = 2
    ),
    Course(
        title = "Applied Mathematics I",
        code = "Math 1041",
        creditHours = 5,
        description = "Application of mathematical concepts to real-world problems in science and engineering.",
        prerequisites = "Mathematics For Natural Sciences",
        year = 1,
        semester = 2
    ),
    Course(
        title = "Entrepreneurship",
        code = "MGMT1012",
        creditHours = 5,
        description = "Fundamentals of starting and managing businesses, including business planning and financial management.",
        prerequisites = "None",
        year = 1,
        semester = 2
    ),
    Course(
        title = "Introduction to Emerging Technologies",
        code = "EmTe-1012",
        creditHours = 5,
        description = "Overview of cutting-edge technologies including AI, IoT, blockchain, and their societal impacts.",
        prerequisites = "None",
        year = 1,
        semester = 2
    ),
    Course(
        title = "Moral and Civic Education",
        code = "MCiE 1012",
        creditHours = 4,
        description = "Study of ethical principles, civic responsibilities, and good governance practices.",
        prerequisites = "None",
        year = 1,
        semester = 2
    ),
    Course(
        title = "Computer Programming",
        code = "SCET 1082",
        creditHours = 5,
        description = "Introduction to programming concepts using Python, covering variables, loops, functions, and basic algorithms.",
        prerequisites = "None",
        year = 1,
        semester = 2
    ),

    // Year II Semester I
    Course(
        title = "Engineering Drawing",
        code = "MEng-2061",
        creditHours = 5,
        description = "Fundamentals of technical drawing, including orthographic projections, isometric views, and CAD basics.",
        prerequisites = "None",
        year = 2,
        semester = 1
    ),
    Course(
        title = "Engineering Mechanics I (Statics)",
        code = "CEng-1051",
        creditHours = 5,
        description = "Study of forces and their effects on stationary objects, covering equilibrium, trusses, and friction.",
        prerequisites = "Applied Mathematics I",
        year = 2,
        semester = 1
    ),
    Course(
        title = "Probability and Statistics for Engineers",
        code = "Stat-2171",
        creditHours = 5,
        description = "Probability theory, statistical methods, and their applications in engineering problems.",
        prerequisites = "Applied Mathematics I",
        year = 2,
        semester = 1
    ),
    Course(
        title = "Applied Mathematics II",
        code = "Math-2041",
        creditHours = 7,
        description = "Advanced mathematical methods including differential equations, vector calculus, and complex numbers.",
        prerequisites = "Applied Mathematics I",
        year = 2,
        semester = 1
    ),
    Course(
        title = "Global Trends",
        code = "GlTr-1012",
        creditHours = 4,
        description = "Analysis of contemporary global issues including international relations, globalization, and geopolitical shifts.",
        prerequisites = "None",
        year = 2,
        semester = 1
    ),
    Course(
        title = "Economics",
        code = "Econ-1011",
        creditHours = 5,
        description = "Principles of microeconomics and macroeconomics, covering supply/demand, market structures, and national income.",
        prerequisites = "None",
        year = 2,
        semester = 1
    ),
    Course(
        title = "Inclusiveness",
        code = "SNIE-1012",
        creditHours = 4,
        description = "Study of diversity, inclusion principles, and strategies for creating inclusive environments.",
        prerequisites = "None",
        year = 2,
        semester = 1
    ),

    // Year II Semester II
    Course(
        title = "Applied Mathematics III",
        code = "Math-2024",
        creditHours = 7,
        description = "Advanced topics including partial differential equations, numerical methods, and transform techniques.",
        prerequisites = "Applied Mathematics II",
        year = 2,
        semester = 2
    ),
    Course(
        title = "Fundamentals of Networking",
        code = "SECT-2171",
        creditHours = 5,
        description = "Introduction to computer networks, covering OSI model, TCP/IP, routing, and basic network security.",
        prerequisites = "Computer Programming",
        year = 2,
        semester = 2
    ),
    Course(
        title = "Fundamentals of Database",
        code = "SECT-2161",
        creditHours = 5,
        description = "Database concepts including relational models, SQL, normalization, and basic database design.",
        prerequisites = "Computer Programming",
        year = 2,
        semester = 2
    ),
    Course(
        title = "Object Oriented Programming",
        code = "SECT-2101",
        creditHours = 5,
        description = "Principles of OOP using Java, covering classes, inheritance, polymorphism, and design patterns.",
        prerequisites = "Computer Programming",
        year = 2,
        semester = 2
    ),
    Course(
        title = "Discrete Mathematics",
        code = "SECT-3092",
        creditHours = 5,
        description = "Mathematical structures for computer science including logic, set theory, combinatorics, and graph theory.",
        prerequisites = "Applied Mathematics I",
        year = 2,
        semester = 2
    ),
    Course(
        title = "Fundamentals of Data Structure and Algorithm",
        code = "SECT-3091",
        creditHours = 7,
        description = "Essential data structures (arrays, linked lists, trees) and algorithms (sorting, searching) with complexity analysis.",
        prerequisites = "Computer Programming, Discrete Mathematics",
        year = 2,
        semester = 2
    )
)