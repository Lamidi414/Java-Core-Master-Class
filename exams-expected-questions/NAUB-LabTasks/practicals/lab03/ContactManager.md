# Explanation:

- **User Input Loop:** Continues accepting contact details until the user types `"done"`.
- **StringBuilder:** Efficiently constructs each contact line before storing it.
- **File Writing:** Uses `BufferedWriter` to save contacts into `contacts.txt`.
- **File Reading:** Uses `BufferedReader` to retrieve stored data.
- **Sorting:** Uses `Collections.sort()` to arrange contacts alphabetically based on names.
- **List Usage:** `List<String>` stores and manages contact records dynamically.

## Sample Output

```text
Enter contacts (type 'done' to finish):
Name: John
Phone: 12345
Email: john@mail.com

Name: Alice
Phone: 67890
Email: alice@mail.com

Name: done

Contacts saved to file.

Sorted Contacts:
Alice, 67890, alice@mail.com
John, 12345, john@mail.com
```
