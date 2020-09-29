# DesignPatterns

## Observer Pattern
	1)  Observer pattern basically deals with one to many relationship between Subject and Observer,
	2) Subject is the object which holds the state
	3) Observer is the Object which Observers the Subject for any state change
	4) Observer pattern can be implemented in 2 ways
		a) Subject pushes the change to all its observer(basically pushes all the data)
		b) Observer pulls the required data

	The benefit with 4.b is that lest say Subject has 10 fields/states to hold and different observers looks for lets say 2-3 different states only states then, in case we are pushing then we are supplying non required field as well, which can be avoided if Observer pulls only the required fields

	### Best practice that one should try and follow
		Coding to an interface or Abstraction rather than coding on implementation as this helps us with minimum places where the change will be required in case any change need to be done for new IMplementation of subject and observers
