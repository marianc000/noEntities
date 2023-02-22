export  function objectsFromRows(rows) {
    const headers = rows[0];
    return rows.slice(1)
            .map(row => Object.fromEntries(headers.map((h, i) => [h, row[i]])));

}
 