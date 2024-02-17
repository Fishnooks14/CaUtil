#pragma once

#include <array>
#include <iostream>

class Vector3f {
   public:
    Vector3f();
    Vector3f(float p_x, float p_y, float p_z);
    Vector3f(std::array<float, 3> components);
    float x, y, z;

    float dot(const Vector3f& other) const;
    static float dot(const Vector3f& vector, const Vector3f& other);

    Vector3f operator+(const Vector3f& other) const;
    Vector3f operator-(const Vector3f& other) const;

    Vector3f& operator+=(const Vector3f& other);
    Vector3f& operator-=(const Vector3f& other);

    Vector3f operator*(const float scalar) const;

    Vector3f& operator*=(const float scalar);
};

Vector3f operator*(const float scale, const Vector3f& vector);

std::ostream& operator<<(std::ostream& os, const Vector3f& vector);