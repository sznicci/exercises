/*
 * Vector.cpp
 *
 *  Created on: Feb 16, 2017
 *      Author: sznicci
 */

#include <iostream>
#include "Vector.h"

using namespace std;

Vector::Vector(int s) :elem{new double[s]}, sz{s}
{
}

double& Vector::operator [](int i)
{
	return elem[i];
}

int Vector::size()
{
	return sz;
}
