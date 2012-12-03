cse23089, 212577433, Gruel, Damien
cse23088, 212577425, Lavalette, Ludovic
cse83049, 209987066, Nahas, Serge

-------
Design:
-------

The layout manager handle the following pair of aspect ratio: 16:9 and 9:16.
The widget that enables the user to toggle between the two orientations is in
the top right-hand corner.
The program is composed of two different classes :
- Window.java : this class creates all the elements of the window (labels, 
	buttons, list, ...), and sets up the parameters of those elements(content, 
	color, ...).
- LayoutMan.java : this class handles with the size of the elements, and deals
	with the toggling between portrait and landscape orientation for the
	window, by redistributing the elements in the space.
The elements in the window are:
- two labels (among whom one fills the window horizontally, and thus can be
	seen as a "wide" element).
- seven buttons (which can be seen as "small" widgets).
- one text field
- one list of items (which can be seen as "tall" widget, and which enables the
	scrolling).

	TODO: describe your design rationale for the fact that with a change of
	aspect ratio the layout manager may "run out of space"
	
	 
--------------------
Additional Features: (optional)
--------------------

Several advanced layout features are supported by the program.
For example, we have the text field and the button on its right (with the
magnifier on it) that stay adjacent, whatever the size and the orientation.
Moreover, the list of items is centered, whatever the size.
And finaly, the first two buttons (the one with the "log out" icon and the one
with the "rotation" icon) are right-aligned, whatever the size and the
orientation.

---------------
Communications:
---------------
All members where present at each meeting.

November 23, 2012; 4:00 - 7:00;
Setup of Git for source control.
First thoughts on designing the layout manager.

November 28, 2012; 4:30 - 8:00;
Designed and coded the position of the elements.
Discussed ways to design and code the layout manager.

November 30, 2012; 4:30 - 10:00;
Designed and coded main classes for the layout manager.

December 02, 2012; 4:30 - ??:??;
Improved the layout manager design and fixed last remaining bugs.
Finished readme.txt

-----------------
Responsibilities:
-----------------

Serge:
GUI layout and programming, add/remove feature programming

Damien:
GUI layout and programming, add/remove feature programming

Ludovic:
Conversion to greyscale programming, add/remove feature programming