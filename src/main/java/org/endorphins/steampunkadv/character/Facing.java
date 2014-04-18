package org.endorphins.steampunkadv.character;

public class Facing{
	public enum Direction{NORTH, SOUTH, EAST, WEST, NORTH_EAST, NORTH_WEST, SOUTH_EAST, SOUTH_WEST}
	public Direction facing = null;
	public boolean newFacing = false;

	public Facing(){
		facing = Direction.SOUTH;
	}

	public Direction getFacing(){
		return facing;
	}

	public void setFacing(Direction d){
		facing = d;
	}

	public int determineFacing(boolean n, boolean s, boolean e, boolean w){
		int row = -1;
		Direction tempDir = this.getFacing();
		if(n){
			row = 0;
			if(e){
				this.setFacing(Direction.NORTH_EAST);
			}
			else if(w){
				this.setFacing(Direction.NORTH_WEST);
			}
			else{
				this.setFacing(Direction.NORTH);
			}
		}
		else if(s){
			row = 1;
			if(e){
				this.setFacing(Direction.SOUTH_EAST);
			}
			else if(w){
				this.setFacing(Direction.SOUTH_WEST);
			}
			else{
				this.setFacing(Direction.SOUTH);
			}
		}
		else if(e){
			row = 2;
			this.setFacing(Direction.EAST);
		}
		else if(w){
			row = 3;
			this.setFacing(Direction.WEST);
		}

		if(this.getFacing() == tempDir){
			newFacing = false;
		}
		else{
			newFacing = true;
		}
		return row;
	}
}
