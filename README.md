# Building Inheritance Application

A Java application demonstrating inheritance using a Building base class
and House / Commercial subclasses.

## Classes
- **Building.java** — base class with private `siding` and `squarefeet`
  fields, getters/setters, and a `totalSquareFeet()` method.
- **House.java** — extends Building; adds livingRoom, kitchen, dining,
  and bedroom sizes; overrides `totalSquareFeet()`.
- **Commercial.java** — extends Building; adds 3 rentable room sizes;
  overrides `totalSquareFeet()`.
- **BuildingApp.java** — driver class with `main()` that prompts the
  user for room sizes for one House and one Commercial building, then
  displays the total square feet of each.

  ## Author
Osagie Egiebor
