# Mockup Data Assigning
class mockup:
     def __init__(self, name, isTrue):
         self.name = name
         self.isTrue = isTrue

# Filter Function - Implement the rule in order to cut out unnecessary item.
def filter(ele):
    return ele == True

# Function; array - targeted array, callback - filter generator
def implemented_list(array, callback):
    for i in array:
        if(callback(i.isTrue)):
            print(i.name)
     
# Testing and Manipulating
list = []
list.append(mockup('I am first element', False))
list.append(mockup('I am second element', False))
list.append(mockup('I am thrid element', True))
    
implemented_list(list, filter)

    