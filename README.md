# java-designpatterns
# Being a Software Developer
## Thinking in Design Patterns

This is my most cherished topic and I am passionate about writing on design patterns than any other topic. If we are software developers in the object-oriented world, then we need to embrace design patterns. So, let's get into the topic as we all know how important it is.

### Pre-requisites 

•	Proficiency in at least one object-oriented programming language.
•	Experience in object-oriented design.
•	Please refer to earlier chapters as I have focused on object-oriented concepts and UML overview.
You don’t need any advanced language features of any object=oriented programming language and all the design patterns can be implemented in object-oriented programming languages. Once you have understood design patterns, your perspective on object-oriented design will change forever. You will be more confident in attempting design solutions.
To be honest I never understood design patterns in my first reading, I kept reading and slowly I was able to make sense of it. In fact, my roots in object orientation have strengthened.
Let me quote the famous words of Eric Gamma
“Designing object-oriented software is hard, and designing reusable object-oriented software is even harder. You must find pertinent objects, factor them into classes at the right granularity, define class interfaces and inheritance hierarchies, and establish key relationships among them. Your design should be specific to the problem at hand but also general enough to address future problems and requirements. You also want to avoid redesign, or at least minimize it. Experienced object-oriented designers will tell you that a reusable and flexible design is difficult if not impossible to get the “right” the first time. Before a design is finished, they usually try to reuse it several times, modifying it each time”
I kept reading the above paragraph many times and every time I read it, I started understanding more. I became a disciple once I read the above paragraph and my interest in design patterns has increased several folds.
Instead of solving every design problem from scratch, expert designers reuse solutions that have worked for them in the past. When they find a good solution, they often use it again and again.
So, you will find recurring patterns of classes and how they interact with other objects. These patterns solve some specific design problems and make object-oriented design flexible, elegant and reusable.
A designer who is familiar with such patterns will apply them immediately to design problems without having to rediscover them add quality to the product.
There are patterns all over the world in all fields. Like a lyricist never writes a song from scratch, they follow patterns like “Romantic Song on love at first sight”, “ Love failure song’, “Inspiring motivational song” etc.
In fact music composers use “raagas” to the best to come up with a composition. When they hire new singers they test them by asking them to sing different “raagas”  to know how good they will be when they will be singing. I call raagas as patterns used by music composers to compose music.
Similarly in the medical field, doctors apply different patterns to perform surgery on patients. The experience of doctors is how effectively they have applied different patterns.
But one thing I want to say that every design problem is not the same, they have different challenges. The success of a designer is not in using the design pattern, but they customize the design pattern to cater to the problem at hand and every designer applies in its own way.
What is a Design Pattern?
A design pattern describes a problem that occurs over and over again in our environment, and then describes the core of the solution to that problem, in such a way that you can use this solution a million times over, without ever doing it the same way twice.
A pattern has four essential elements:
1.	Pattern Name – just a handle to describe a design problem. A pattern name helps in applying design patterns to the problem at hand.
2.	Problem –  describes when to apply the pattern.
3.	Solution – describes the elements that make up the design, their relationships, responsibilities and collaborations. A pattern is like a template that can be applied in many different solutions.
4.	Consequences – are the results and trade-offs of applying the pattern. Since reuse is an important factor and the consequence of a pattern includes its impact or flexibility, extensibility or portability. 
Describing Design Patterns
Design patterns are described using a consistent format. Each pattern is divided into sections according to the following template. The structure of the template is as follows.
1.	Pattern Name – A good name is vital, because it will become part of your design vocabulary.
2.	Intent – What does the design pattern do? What particular design issue or problem does it address?
3.	Also known as – any other names for the pattern, if any.
4.	Motivation – A scenario that describes the design problem
5.	Applicability – Situations where design patterns can be applied? Poor design that pattern addresses
6.	Structure –  class diagram for the design pattern.
7.	Participants – The classes and/or participating in the design pattern and their responsibilities.
8.	Collaborations –  How the participants collaborate to carry out their responsibilities. 
9.	Consequences – Trade-offs and the results of using the pattern
10.	Implementations – pitfalls, hints or techniques should you be aware of when implementing the pattern?
11.	Sample Code – code.
12.	Known uses – a few examples where they have been used.
13.	Related Patterns – other related patterns
Design Patterns are object-oriented software design practices for solving common design problems. Design patterns provide the reuse of proven designs and architectures rather than the reuse of code. The most well-known design pattern literature is available in the book published by Gang of Four. They cataloged 23 design patterns with their specific solutions to common design problems, benefits and advantages.
Design Patterns have many benefits like improving software quality, understandability, flexibility, extensibility, maintainability and reducing development time.
Design Pattern Catalog


Creational Patterns
Creational Patterns abstract the instantiation process. They help make a system independent of how its objects are created, composed and represented. A class creational pattern uses inheritance to vary the class that’s instantiated, whereas object creational patterns will delegate the instantiation to another object.
 
