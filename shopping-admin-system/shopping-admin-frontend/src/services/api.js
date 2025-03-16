import axios from "axios";
import API_BASE_URL from "../config";

const api = axios.create({
  baseURL: API_BASE_URL,
});

// Fetch all products
export const getProducts = async () => {
  return await api.get("/products");
};

// Add a product
export const addProduct = async (product) => {
  return await api.post("/products", product);
};

// Update a product
export const updateProduct = async (id, product) => {
  return await api.put(`/products/${id}`, product);
};

// Delete a product
export const deleteProduct = async (id) => {
  return await api.delete(`/products/${id}`);
};
