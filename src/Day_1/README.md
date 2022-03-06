#Create and Write to a file with Java

##Create the file
- The Creation throws and exception if the file didn't get created, which needs handling
- Import java.io with IOException and File 
- Use createNewFile() to create the file
- This method already checks if the file exists in the same directory.

##Write To a File
- We use the FileWriter class together with its write() method
- You should close it with the close() method after finish writing to the file
- Same exception... display error with printStackTrace()
