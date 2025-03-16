import React, { useEffect, useState } from "react";
import { getProducts, deleteProduct } from "../services/api";
import { Container, Card, Button, Row, Col } from "react-bootstrap";

const ProductList = () => {
  const [products, setProducts] = useState([]);

  useEffect(() => {
    fetchProducts();
  }, []);

  const fetchProducts = async () => {
    try {
      const response = await getProducts();
      setProducts(response.data);
    } catch (error) {
      console.error("Error fetching products:", error);
    }
  };

  const handleDelete = async (id) => {
    try {
      await deleteProduct(id);
      fetchProducts();
    } catch (error) {
      console.error("Error deleting product:", error);
    }
  };

  return (
    <Container className="mt-5">
      <h2 className="text-center mb-4" style={{ color: "#007bff" }}>🛍️ Product List</h2>
      <Row>
        {products.map((product) => (
          <Col md={4} key={product.id} className="mb-4">
            <Card style={{ background: "#f8f9fa", borderRadius: "10px" }}>
              <Card.Body>
                <Card.Title style={{ fontWeight: "bold", color: "#343a40" }}>
                  {product.name}
                </Card.Title>
                <Card.Text style={{ fontSize: "18px", color: "#28a745" }}>
                  💰 ${product.price}
                </Card.Text>
                <Button 
                  variant="danger"
                  onClick={() => handleDelete(product.id)}
                  className="mt-2"
                >
                  ❌ Delete
                </Button>
              </Card.Body>
            </Card>
          </Col>
        ))}
      </Row>
    </Container>
  );
};

export default ProductList;
