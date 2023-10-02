/*
 * 7 - Social Media Profile
Design a class UserProfile with attributes like username, bio, and friends list. Implement
methods to add friends, remove friends, update the bio, and display user profile details.

 */
import java.util.*;

public class UserProfile {

  private static final Scanner scanner = new Scanner(System.in);
  private static List<UserProfile> Users = new ArrayList<UserProfile>();
  public String username, bio;
  List<UserProfile> friends = new ArrayList<UserProfile>();

  UserProfile(String username, String bio) {
    this.username = username;
    setBio(bio);
    Users.add(this);
    System.out.println("user created successfully!");
  }

  static UserProfile getUser(String username) {
    for (UserProfile user : Users) {
      if (user.username.equals(username)) {
        return user;
      }
    }
    System.out.println("There is no user with the given username");
    return null;
  }

  void addFriends() {
    String friend_name;
    UserProfile friend;
    int choice = 1;
    while (choice == 1) {
      System.out.print("enter the username of the friend:");
      friend_name = scanner.next();
      friend = getUser(friend_name);
      if (friend != null) {
        this.friends.add(friend);
        System.out.println(
          friend_name + " added to friends list of " + this.username
        );
      }

      do {
        System.out.print("Do you want to add another friend?[1/0]:");
        choice = scanner.nextInt();
        if ((choice > 1 || choice < 0)) {
          System.out.println("Enter a valid choice.");
        }
      } while (choice > 1 || choice < 0);
      if (choice == 0) {
        break;
      }
    }
    //add multiple friends
  }

  void removeFriends() {
    String friend_name;
    UserProfile friend;
    int choice = 1;
    while (choice == 1) {
      System.out.print("enter the username of the friend:");
      friend_name = scanner.next();
      friend = getUser(friend_name);
      if (friend != null) {
        if (this.friends.remove(friend)) {
          System.out.println(
            friend_name + " removed from friends list of " + this.username
          );
        } else {
          System.out.println("\tFriend not found in your Friends List!");
        }
      }

      do {
        System.out.print("Do you want to remove another friend?[1/0]:");
        choice = scanner.nextInt();
        if (choice > 1 || choice < 0) {
          System.out.println("Enter a valid choice.");
        }
      } while (choice > 1 || choice < 0);
      if (choice == 0) {
        break;
      }
    }
  }

  void setBio(String bio) {
    this.bio = bio;
  }

  String getbio() {
    return this.bio;
  }

  void displayProfile() {
    System.out.println("Profile Details:");
    System.out.println("Username:" + this.username);
    System.out.println("Bio:" + this.bio);
    System.out.println("Friends");
    for (UserProfile friend : friends) {
      System.out.println(friend.username);
    }
  }

  public static void main(String[] args) {
    int choice;
    String user_name, bio;
    boolean exit = false;
    UserProfile current_user;
    //first User
    System.out.print("enter User name:");
    user_name = scanner.next();
    System.out.print("enter the bio:");
    bio = scanner.next();
    current_user = new UserProfile(user_name, bio);
    System.out.println("CURRENT USER:" + current_user.username);
    while (true) {
      System.out.println("Enter");
      System.out.println("1 to Create user");
      System.out.println("2 to add friends");
      System.out.println("3 to remove friend ");
      System.out.println("4 to Update bio");
      System.out.println("5 to Display profile");
      System.out.println("6 to Switch user");
      System.out.println("7 to exit");
      System.out.print("enter your choice:");
      choice = scanner.nextInt();
      if (!(choice >= 1 && choice <= 7)) {
        System.out.println("\n !! Enter a valid choice !!\n");
        continue;
      }
      switch (choice) {
        case 1:
          System.out.print("enter User name:");
          user_name = scanner.next();
          System.out.print("enter the bio:");
          bio = scanner.next();
          if (getUser(user_name) == null) {
            current_user = new UserProfile(user_name, bio);

          } else {
            System.out.println("A user with this user name already exists!!");
          }
          System.out.println("CURRENT USER:" + current_user.username);
          break;
        case 2:
          current_user.addFriends();
          break;
        case 3:
          current_user.removeFriends();
          break;
        case 4:
          System.out.println("Current bio:" + current_user.getbio());
          System.out.print("enter new the bio:");
          bio = scanner.next();
          current_user.setBio(bio);
          System.out.println("Bio Updated sucessfully");
          break;
        case 5:
          current_user.displayProfile();
          break;
        case 6:
          System.out.print("enter User name:");
          user_name = scanner.next();
          if (getUser(user_name) != null) {
            current_user =getUser(user_name)  ;
          }
          break;
        case 7:
          exit = true;
      }
      if (exit) {
        break;
      }
    }
  }
}
