/*
 * Vector.cpp
 *
 *  Created on: Feb 16, 2017
 *      Author: sznicci
 */

#include <iostream>

using namespace std;

struct Vector {
	int sz;
	double* elem;
};

void vector_init(Vector& v, int s) {
	v.elem = new double[s];
	v.sz = s;
}

double read_and_sum(int s) {
	Vector v;
	vector_init(v, s);
	for (auto i = 0; i != s; ++i) {
		cin >> v.elem[i];
	}

	double sum = 0;
	for (auto i = 0; i != s; ++i) {
		sum += v.elem[i];
	}
	return sum;
}

int main(int argc, char **argv) {
	cout << "Sum is " << read_and_sum(5);
}
