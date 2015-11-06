# Listing_4_16_project: How to generate a random upper case letter


##Introduction
This document details the generation of a Java program that writes an uppercase letter to the console. This code is managed inside Github.com and uses the Math.random() method as well as a custom method call.


## Outline
``` java
//  Generate a random uppercase letter (using a custom method to call)
// Print the random letter to the console.
```

## References and Literature
// Liang Java 10th edition. Pg 87, Listing 3.3
// int number1 = (int)(Math.random() *10);

// Liang Java 10th edition. Pg 125, Listing 4.4
// We can map from integers to Capital letters
// Characters ‘A’ to ‘Z’ have a Value in Decimal 65 to 90.

// Liang Java 10th edition. Pg 122, 4.2.5 the random method.
// a + Math.random() * b
// returns a random number between a and a+b, excluding a+b

// Liang Java 10th edition. Pg 209, 6.4, void Method Example.
// This shows how we can set up a method call.




1. Open Eclipse and start new project
	a.may need to change to your workspace
2. Go to Github and start a new project.
3. Use command prompt to make the connections
	a. navigate to the correct location

C:\Users\LAB>E:
E:\>dir
 Volume in drive E is USB20FD
 Volume Serial Number is 4792-F1AD

E:\ComputerScience Work>dir
 Volume in drive E is USB20FD
 Volume Serial Number is 4792-F1AD

E:\ComputerScience Work>cd Listing_4_16_project

Continue working through instructions 


C:\Users\LAB>E:

E:\>cd desktop
The system cannot find the path specified.

E:\>dir
 Volume in drive E is USB20FD
 Volume Serial Number is 4792-F1AD

 Directory of E:\

06/21/2015  01:06 PM    <DIR>          eclipse
10/30/2015  09:44 AM    <DIR>          English Homework
10/30/2015  09:45 AM    <DIR>          ComputerScience Work
11/01/2015  12:20 PM    <DIR>          .metadata
               0 File(s)              0 bytes
               4 Dir(s)  63,754,829,824 bytes free

E:\>cd "ComputerScience Work"

E:\ComputerScience Work>dir
 Volume in drive E is USB20FD
 Volume Serial Number is 4792-F1AD

 Directory of E:\ComputerScience Work

10/30/2015  09:45 AM    <DIR>          .
10/30/2015  09:45 AM    <DIR>          ..
10/22/2015  03:46 PM    <DIR>          Project Zero
10/22/2015  04:32 PM    <DIR>          ProjectOneProject
09/14/2015  09:51 AM            12,600 Homework2(Computer).docx
09/16/2015  05:20 PM            15,798 Homework3_2.3(Computer).docx
09/16/2015  05:19 PM            16,138 Homework3_2.9(Computer).docx
09/16/2015  05:18 PM            16,106 Homework3_2.17(Computer).docx
10/27/2015  11:55 PM    <DIR>          FirstRepository
10/26/2015  09:12 AM    <DIR>          Fun_With_Functions_Project
09/11/2015  01:09 PM    <DIR>          Homework1.6
09/09/2015  09:12 AM    <DIR>          DoStuff
10/07/2015  09:21 AM    <DIR>          AStepForward(10.7.15)
09/11/2015  12:53 PM    <DIR>          1.6Homework
10/13/2015  01:04 AM    <DIR>          AdditionGam
10/30/2015  09:14 AM    <DIR>          Addition_Game
11/02/2015  09:14 AM    <DIR>          .metadata
11/02/2015  09:15 AM    <DIR>          Listing_4_16_project
               4 File(s)         60,642 bytes
              14 Dir(s)  63,754,829,824 bytes free

E:\ComputerScience Work>cd Listing_4_16_project

*E:\ComputerScience Work\Listing_4_16_project>echo # Listing_4_16_project >> READ
ME.md

*E:\ComputerScience Work\Listing_4_16_project>git init
Initialized empty Git repository in E:/ComputerScience Work/Listing_4_16_project
/.git/

*E:\ComputerScience Work\Listing_4_16_project>git add .

*E:\ComputerScience Work\Listing_4_16_project>git config user.name "KrisionAyers"


*E:\ComputerScience Work\Listing_4_16_project>git config user.email "ayersk@stude
nt.swosu.edu"

*E:\ComputerScience Work\Listing_4_16_project>git commit -m "first commit"
[master (root-commit) 2dd80da] first commit
 5 files changed, 32 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .project
 create mode 100644 README.md
 create mode 100644 bin/Listing_4_16_project.class
 create mode 100644 src/Listing_4_16_project.java

*E:\ComputerScience Work\Listing_4_16_project>git remote add origin https://githu
b.com/KrisionAyers/Listing_4_16_project.git

*E:\ComputerScience Work\Listing_4_16_project>git push -u origin master
Username for 'https://github.com': KrisionAyers
Password for 'https://KrisionAyers@github.com':
Counting objects: 9, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (8/8), done.
Writing objects: 100% (9/9), 1.28 KiB | 0 bytes/s, done.
Total 9 (delta 0), reused 0 (delta 0)
To https://github.com/KrisionAyers/Listing_4_16_project.git
 * [new branch]      master -> master
Branch master set up to track remote branch master from origin.

E:\ComputerScience Work\Listing_4_16_project>
