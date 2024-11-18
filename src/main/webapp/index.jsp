<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Finance Tracker</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <header>
            <h1>Finance Tracker</h1>
        </header>

        <div class="balance">
            <h2>Current Balance</h2>
            <p id="balance-amount">$0.00</p>
        </div>

        <div class="tracker-section">
            <div class="income">
                <h3>Income</h3>
                <p id="income-amount">$0.00</p>
            </div>
            <div class="expenses">
                <h3>Expenses</h3>
                <p id="expenses-amount">$0.00</p>
            </div>
        </div>

        <div class="add-transaction">
            <h3>Add Transaction</h3>
            <form id="transaction-form" method="POST" action="user">
                <input type="text" id="description" name="description" placeholder="Description" required>
                <input type="number" id="amount" name="amount" placeholder="Amount" required>
                <select id="type" name="type" required>
                    <option value="income">Income</option>
                    <option value="expense">Expense</option>
                </select>
                <button type="submit">Add Transaction</button>
            </form>
        </div>

        <div class="transaction-history">
            <h3>Transaction History</h3>
            <ul id="transaction-list">
                <!-- Dynamic list of transactions will appear here -->
            </ul>
        </div>
    </div>
</body>
</html>
