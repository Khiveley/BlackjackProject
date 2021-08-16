# Blackjack Project

#  Description

  In this project, I was tasked with creating a functional command line blackjack game.  For the sake of simplicity, I left the value of the Ace card as 11.  It was to follow the basic rules of Blackjack; however, multiple stretch goals were suggested upon completion of a working game.  I elected to spend my focus on making my game logic as streamlined and efficient as possible and my classes as comprehensive as possible while trying to maintain separation of concern.
  
  At its most basic, Blackjack is a game between a player and a dealer each trying to get a count of cards as close to 21 without going over.  Numeric cards are worth the respective values, in this game instance Ace is 11, and face cards are each 10.  The player can choose to "Hit" take additional cards up to 21.  Going over 21 for either player or dealer is a "Bust."  "Blackjack" is getting a value of 21 in your first two cards.  A "push" is when the dealer and player both have hands where their values are identical.
   
# How to Use

Feel free to import into your IDE.  This has been created and tested in Eclipse.  

# Technologies Used

  * Object Oriented Programming
  * Conditional Statements
  * Enums for Rank and Suit Cards

# Lessons Learned

  Starting is always one of the biggest challenges. My focus on each project is making sure that my design of objects will in the end make my job as a programmer easier in the long run.  I found this project challenging due to trying to determine which class should do what responsibilities.  I tried to have incredibly good encapsulation of my objects and a majority of my game logic is housed in Dealer. I believed this to be the most appropriate route to take since he is largely responsible in the "real world" for keeping the game running and applying any of the rules of the game and the "house" if they have any that are unique to their locale. I mostly called methods into my app which makes for really easy readability of what the Blackjack App does but it comes with a trade off my dealer class maybe not being the most intuitive in its structuring. If I were to do this project again, I think that I could strike a better balance between the two to the same effect.  I have a much better understanding of encapsulation as I used it so very much in using the get values or methods of my various classes.  As a bit of a perfectionist, I'm always looking to how I might improve my abilities for the future as well as past projects.  
  
  This project in my estimation has a much greater complexity than our past projects.  I have learned that I need to be more patient with myself and at times talk through (often out loud) my reasoning for selecting a field to pull into a variable or method and have appreciated being able to take advantage of TA hours and having Zoom meetings with classmates where we can learn from each other.  I have also learned more this weekend than at any other time that I need to give myself breaks by walking away from code from time to time to give myself the creative space to problem solve more effectively.  I have a game that works and I'm really proud of what I was able to accomplish over this weekend.
