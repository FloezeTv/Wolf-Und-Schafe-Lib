# Wolf und Schafe Lib
This repo is a library for our computer sience project "Wolf und Schafe".

# Description
The repo provides some classes/interfaces for standardized use for the project.

## Controller
This is an interface for a Controller. A Controller needs to be able to set the Gamemode using the Controller.Mode class and receive the moves of the wolf and the sheeps. Also a Controller should be able to reset the playfield.

## View
This is an interface for a View. A View needs to be able to change the displayed position of the sheeps and the wolf. It should also be able to show the active player and the winner, if the game is over. The view has no reset method, as the Controller should manually set the position of each sheep, depending on the starting position.

## Player
This is an enum where there are 2 players: `WOLF` and `SHEEP`. This is, because internal the game should only differenciate between those two and the view should give them the appropriate names.

## Position2D
This is a simple class that just stores a single 2D coordinate.