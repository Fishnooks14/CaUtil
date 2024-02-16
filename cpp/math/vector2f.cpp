#include "vector2f.hpp"

#include <iostream>

Vector2f::Vector2f() : x(0.0f), y(0.0f) {}

Vector2f::Vector2f(float p_x, float p_y) : x(p_x), y(p_y) {}

float Vector2f::dot(const Vector2f& other) const {
    return (x * other.x) + (y * other.y);
}

float Vector2f::dot(const Vector2f& vector, const Vector2f& other) {
    return (vector.x * other.x) + (vector.y + other.y);
}

Vector2f Vector2f::operator+(const Vector2f& other) const {
    return Vector2f(x + other.x, y + other.y);
}
Vector2f Vector2f::operator-(const Vector2f& other) const {
    return Vector2f(x - other.x, y - other.y);
}

Vector2f& Vector2f::operator+=(const Vector2f& other) {
    x += other.x;
    y += other.y;
    return *this;
}
Vector2f& Vector2f::operator-=(const Vector2f& other) {
    x -= other.x;
    y -= other.y;
    return *this;
}

Vector2f Vector2f::operator*(const float scalar) const {
    return Vector2f(x * scalar, y * scalar);
}
Vector2f& Vector2f::operator*=(const float scalar) {
    x *= scalar;
    y *= scalar;
    return *this;
}

Vector2f operator*(const float scalar, const Vector2f& vector) {
    return Vector2f(vector.x * scalar, vector.y * scalar);
}

std::ostream& operator<<(std::ostream& os, const Vector2f& vector) {
    return os << "(" << vector.x << ", " << vector.y << ")";
}