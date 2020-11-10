import React from "react";
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";
import { Navbar, Nav, NavItem, NavDropdown } from "react-bootstrap";
import Login from "./login";

const NavBarIO = () => {
  return (
    <>
      <Router>
        <Header />
        <div>
          <Content />
        </div>
      </Router>
    </>
  );
};

const Header = () => {
  return (
    <>
      <div>
        <Navbar bg="dark" variant="dark">
          <Navbar.Brand as={Link} to="/">
            CA-3 Gruppe 5
          </Navbar.Brand>
          <Navbar.Collapse id="responsive-navbar-nav">
            <Nav className="mr-auto">
              <NavItem href="/">
                <Nav.Link as={Link} to="/">
                  Home
                </Nav.Link>
              </NavItem>
              <NavItem href="/Readme">
                <Nav.Link as={Link} to="/Readme">
                  Readme
                </Nav.Link>
              </NavItem>
              <NavDropdown title="Dropdown" id="basic-nav-dropdown">
                <NavDropdown.Item as={Link} to="/">
                  Home
                </NavDropdown.Item>
                <NavDropdown.Item as={Link} to="/Readme">
                  Readme
                </NavDropdown.Item>
              </NavDropdown>
            </Nav>
          </Navbar.Collapse>
        </Navbar>
      </div>
    </>
  );
};

const Content = () => {
  return (
    <Switch>
      <Route exact path="/" component={Home} />
      <Route path="/Readme" component={Readme} />
      <Route path="*" component={NoMatch} />
    </Switch>
  );
};

const Readme = () => {
  return (
    <>
      <p>Hejsa readme</p>
    </>
  );
};

const Home = () => {
  return <Login />;
};

const NoMatch = () => {
  return <p>There was no match</p>;
};

export default NavBarIO;
