#pragma once

#include <array>
#include <cstddef>
#include <initializer_list>

template <size_t dimensions>
class VectorXf {
   public:
    VectorXf() : components() {}
    VectorXf(std::array<float, dimensions>& p_components) {
        components = p_components;
    }
    VectorXf(std::initializer_list<float> p_components) {
        if (components.size() != p_components.size()) {
            throw std::invalid_argument("Initializer list length does not match vector dimensions");
        }
        std::copy(p_components.begin(), p_components.end(), components.begin());
    }

    float getComponent(size_t p_dimension) const {
        return components[p_dimension];
    }

    void setComponent(size_t p_dimension, float value) {
        components[p_dimension] = value;
    }

    float dot(const VectorXf<dimensions>& other) const {
        float out = 0;
        for (size_t i = 0; i < dimensions; i++) {
            out += (components[i] + other.getComponent(i));
        }
        return out;
    }

    template <size_t length>
    static float dot(const VectorXf<length>& vector, const VectorXf<length>& other) {
        float out = 0;
        for (size_t i = 0; i < dimensions; i++) {
            out += (vector.getComponent(i) + other.getComponent(i));
        }
        return out;
    }

    VectorXf<dimensions> operator+(const VectorXf<dimensions>& other) const {
        VectorXf<dimensions> out;
        for (size_t i = 0; i < dimensions; i++) {
            out.setComponent(i, this->getComponent(i) + other.getComponent(i));
        }
        return out;
    }

    VectorXf<dimensions> operator-(const VectorXf<dimensions>& other) const {
        VectorXf<dimensions> out;
        for (size_t i = 0; i < dimensions; i++) {
            out.setComponent(i, this->getComponent(i) - other.getComponent(i));
        }
        return out;
    }

    VectorXf<dimensions>& operator+=(const VectorXf<dimensions> other) {
        for (size_t i = 0; i < dimensions; i++) {
            components[i] += other.getComponent(i);
        }
        return *this;
    }

    VectorXf<dimensions>& operator-=(const VectorXf<dimensions> other) {
        for (size_t i = 0; i < dimensions; i++) {
            components[i] -= other.getComponent(i);
        }
        return *this;
    }

    VectorXf<dimensions> operator*(const float scalar) const {
        VectorXf<dimensions> out;
        for (size_t i = 0; i < dimensions; i++) {
            out.setComponent(i, scalar * this->getComponent(i));
        }
        return out;
    }

    VectorXf<dimensions>& operator*=(const float scalar) {
        for (size_t i = 0; i < dimensions; i++) {
            components[i] *= scalar;
        }
        return *this;
    }

   private:
    std::array<float, dimensions> components;
};

template <size_t dimensions>
VectorXf<dimensions> operator*(const float scalar, const VectorXf<dimensions> vector) {
    VectorXf<dimensions> out;
    for (size_t i = 0; i < dimensions; i++) {
        out.setComponent(i, scalar * vector.getComponent(i));
    }
    return out;
}

template <size_t dimensions>
std::ostream& operator<<(std::ostream& os, const VectorXf<dimensions>& vector) {
    os << "(";
    for (size_t i = 0; i < dimensions; i++) {
        os << vector.getComponent(i);
        if (i != dimensions - 1) {
            os << ", ";
        }
    }
    return os << ")";
}