# Running the Java Program locally

1. Clone the repo
2. Open the project with an IDE such as Eclipse ( I used Eclipse)
3. Make sure build path is configured to root directory
4. set to desired JDK.  In Eclipse go to configure JREs and select Search; navigate to the directory where the JDK is stored.
5. Install JUNIT 4


# Git branching strategy
1.  Always pull latest changes from master branch to your own branch
2.  After making changes to your own local branch, pull latest changes from master once again; reason for this is because while you were making changes on your branch,
master might have been updated by another team member.  This is good practice to reduce merge conflicts.
3.  Push your branch to the remote repository; remote repository should have a branch name that matches your local branch's name.
4. Open a pull request (code review) to master
5. Another team member will take a look at the pull request and give feedback. 
6. After the other team member is satisfied with the changes, this team member can merge to master.


