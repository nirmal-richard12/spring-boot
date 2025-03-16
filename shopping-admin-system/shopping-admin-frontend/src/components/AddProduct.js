import React, { useState } from "react";
import { addProduct } from "../services/api";

const AddProduct = () => {
  const [product, setProduct] = useState({ name: "", price: "" });

  const handleSubmit = async (e) => {
    e.preventDefault();
    await addProduct(product);
    setProduct({ name: "", price: "" });
  };

  return (
    <div>
      <h2>Add Product</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          placeholder="Product Name"
          value={product.name}
          onChange={(e) => setProduct({ ...product, name: e.target.value })}
          required
        />
        <input
          type="number"
          placeholder="Price"
          value={product.price}
          onChange={(e) => setProduct({ ...product, price: e.target.value })}
          required
        />
        <button type="submit">Add Product</button>
      </form>
    </div>
  );
};

export default AddProduct;
