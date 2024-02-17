#include "vector3f.hpp"

Vector3f::Vector3f() : x(0.0f), y(0.0f), z(0.0f) {}

Vector3f::Vector3f(float p_x, float p_y, float p_z) : x(p_x), y(p_y), z(p_z) {}

Vector3f::Vector3f(std::array<float, 3> components) : x(components[0]), y(components[1]), z(components[2]) {}

float Vector3f::dot(const Vector3f& other) const {
    return (x * other.x) + (y * other.y) + (z * other.z);
}

float Vector3f::dot(const Vector3f& vector, const Vector3f& other) {
    return (vector.x * other.x) + (vector.y + other.y) + (vector.z * other.x);
}

Vector3f Vector3f::operator+(const Vector3f& other) const {
    return Vector3f(x + other.x, y + other.y, z + other.z);
}
Vector3f Vector3f::operator-(const Vector3f& other) const {
    return Vector3f(x - other.x, y - other.y, z - other.z);
}

Vector3f& Vector3f::operator+=(const Vector3f& other) {
    x += other.x;
    y += other.y;
    z += other.z;
    return *this;
}

Vector3f& Vector3f::operator-=(const Vector3f& other) {
    x -= other.x;
    y -= other.y;
    z -= other.z;
    return *this;
}

Vector3f Vector3f::operator*(const float scalar) const {
    return Vector3f(x * scalar, y * scalar, z * scalar);
}
Vector3f& Vector3f::operator*=(const float scalar) {
    x *= scalar;
    y *= scalar;
    z *= scalar;
    return *this;
}

Vector3f operator*(const float scalar, const Vector3f& vector) {
    return Vector3f(vector.x * scalar, vector.y * scalar, vector.z * scalar);
}

std::ostream& operator<<(std::ostream& os, const Vector3f& vector) {
    return os << "(" << vector.x << ", " << vector.y << ", " << vector.z << ")";
}