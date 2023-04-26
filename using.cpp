// demonstrate the usage of the 'using' keyword in cpp
# include <iostream>

// imported everything from the namespace
using namespace std;

// making custom keywords with the word using
using number = int;

int main(int argc, char *argv[]){
	std::cout << "This is the cout method without the using keyword\n";
	// the keyword std:: was avoided with the use of using
	cout << "This is the cout without the using keyword\n";
	
	// and it works perfectly
	number n;
	n = 10;
	
	cout << "The custom number created with using: " << n;
	
	return 0;
}