int age = 23;
boolean hasLicence = false;

if ( age >= 18 && hasLicence ) {
    System.out.println("You are cleared to drive.")
} else {
    System.out.println("You are NOT cleared to drive.")
}

String role = "Admin";

if (role.equals("Admin") || role.equals("Manager") ){
    System.out.println("Logged in succesfully.")
} else {
    System.out.println("Acess is denied.")
}


String userName = null;

if (userName != null && userName.length() > 3){
    System.out.println("Username accepted.")
} else {
    System.out.println("Username not correct, please try again.")
}