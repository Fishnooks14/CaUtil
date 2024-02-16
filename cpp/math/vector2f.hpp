#pragma once

#include <iostream>

class Vector2f {
   public:
    Vector2f();
    Vector2f(float p_x, float p_y);
    float x, y;

    float dot(const Vector2f& other) const;
    static float dot(const Vector2f& vector, const Vector2f& other);

    Vector2f operator+(const Vector2f& other) const;
    Vector2f operator-(const Vector2f& other) const;

    Vector2f& operator+=(const Vector2f& other);
    Vector2f& operator-=(const Vector2f& other);

    Vector2f operator*(const float scalar) const;

    Vector2f& operator*=(const float scalar);
};

Vector2f operator*(const float scale, const Vector2f& vector);

std::ostream& operator<<(std::ostream& os, const Vector2f& vector);