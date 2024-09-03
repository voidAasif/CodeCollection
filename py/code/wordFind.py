#index value == found
#-1 == not found

string = "hello hey what why who and or is am are not non null for full fish we have has had his him her  12 000    <> /"

fishFind = string.find("fish")
print(fishFind)

whoFind = string.find("who")
print(whoFind)

find000 = string.find("000")
print(find000)

spaceFind = string.find("   ")
print(spaceFind)

unknownFind = string.find("unknown")
print(unknownFind)