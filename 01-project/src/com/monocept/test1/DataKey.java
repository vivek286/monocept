package com.monocept.test1;

public class DataKey {
	

		private String name;
		private int id;

	        // getter and setter methods

		@Override
		public String toString() {
			return "DataKey [name=" + name + ", id=" + id + "]";
		}

		public void setId(int i) {
			this.id=i;
			
		}

		public void setName(String string) {
			this.name=string;
			
		}

	
	
}
