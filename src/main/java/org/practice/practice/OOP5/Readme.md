# Описание:
Сделал описание в рамках пятого задания. 
# a)Single responsibility principle
Классы Student, Teacher , как и все остальные классы предназначены, чтобы решать конкретно свои задачи, задачи своей области. 
# b)Open-Closed principle
Была добавлена функция поиска студентов в группе по их настроению с помощью интерфейса SearchMood. Был создан отдельный новый класс SearchMoodClass, который имплементирует данный интерфейс. Далее, функционал старого класса Students был *расширен* с помощью экземпляра нашего нового класса SearchMoodClass. 
# c)Liskov Substitution principle
Классы Student и Teacher являются наследниками абстрактного класса TrainingGroup и они соответствует поведению и типу абстрактного родительского класса
# d)Interface Segregation principle
Интерфейс SearchMood предназначен, чтобы решать конкретно свою локальную задачу.
# e)Dependency Inversion principle
Класс Manage и класс SearchHappyMoodClass взаимодействуют между собой с помощью интерфейса SearchMood. (SearchHappyMoodClass имплементирует интерфейс SearchMood). Таким образом, можно добавить и другие классы по типу SearchHappyMoodClass, которые будут имплементировать один интерфейс SearchMood.